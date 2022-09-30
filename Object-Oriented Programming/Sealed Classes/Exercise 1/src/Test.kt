package sealedClassesExercise1

class Test {}

sealed interface UiStateWrapper {
    object Loading : UiStateWrapper
    class Success<T>(val uiState: T) : UiStateWrapper
    class Failure(val exception: Throwable) : UiStateWrapper
}

