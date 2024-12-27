package com.example.ielstlearningapplication.presentation.pages.Listening.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ielstlearningapplication.domain.models.Listening
import com.example.ielstlearningapplication.domain.usecase.aichat.FetchListeningDataUseCase
import kotlinx.coroutines.launch

class ListeningViewModel(
    private val fetchListeningDataUseCase: FetchListeningDataUseCase
) : ViewModel() {

    // Danh sách tất cả Listening
    private val _listeningData = MutableLiveData<List<Listening>>()
    val listeningData: LiveData<List<Listening>> get() = _listeningData

    // Trạng thái của một bài Listening cụ thể
    private val _selectedListening = MutableLiveData<Listening?>()
    val selectedListening: LiveData<Listening?> get() = _selectedListening

    // Trạng thái loading
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    // Trạng thái lỗi
    private val _errorMessage = MutableLiveData<String?>()
    val errorMessage: LiveData<String?> get() = _errorMessage

    // Fetch tất cả dữ liệu Listening
    fun fetchListeningData() {
        viewModelScope.launch {
            _isLoading.value = true
            _errorMessage.value = null
            try {
                val response = fetchListeningDataUseCase.execute()
                _listeningData.value = response.listenings
                if (response.listenings.isNotEmpty()) {
                    _selectedListening.value = response.listenings[0] // Mặc định chọn bài đầu tiên
                }
            } catch (e: Exception) {
                _errorMessage.value = e.localizedMessage ?: "Something went wrong"
            } finally {
                _isLoading.value = false
            }
        }
    }

    // Chọn một bài Listening cụ thể
    fun selectListening(listening: Listening) {
        _selectedListening.value = listening
    }
}
