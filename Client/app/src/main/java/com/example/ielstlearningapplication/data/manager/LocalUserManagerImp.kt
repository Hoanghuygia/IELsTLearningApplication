package com.example.ielstlearningapplication.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.ielstlearningapplication.domain.manager.LocalUserManager
import com.example.ielstlearningapplication.utils.Constants
import com.example.ielstlearningapplication.utils.Constants.USER_INFOR
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val readOnlyProperty = preferencesDataStore(name = USER_INFOR)

val Context.dataStore: DataStore<Preferences> by readOnlyProperty

private object PreferenceKeys {
    val USER_GMAIL = stringPreferencesKey(Constants.USER_GMAIL)
}

class LocalUserManagerImp(
    private val context: Context
): LocalUserManager{
    override suspend fun saveUserEmail(userEmail: String) {
        context.dataStore.edit { information ->
            information[PreferenceKeys.USER_GMAIL] = userEmail
        }
    }

    override fun readUserEmail(): Flow<String> {
        return context.dataStore.data.map { preferences ->
            preferences[PreferenceKeys.USER_GMAIL] ?: ""
        }
    }

}