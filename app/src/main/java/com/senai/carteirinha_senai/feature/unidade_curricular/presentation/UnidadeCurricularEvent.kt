package com.senai.carteirinha_senai.feature.unidade_curricular.presentation

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados : UnidadeCurricularEvent
    data object OnTentarNovamenteClick : UnidadeCurricularEvent
    data object OnVoltarClick : UnidadeCurricularEvent
}