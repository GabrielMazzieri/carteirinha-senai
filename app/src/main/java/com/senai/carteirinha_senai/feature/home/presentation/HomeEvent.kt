package com.senai.carteirinha_senai.feature.home.presentation;
sealed interface HomeEvent {
    data object OnCarteirinhaClick : HomeEvent
    data object OnUnidadesCurricularesClick : HomeEvent
}