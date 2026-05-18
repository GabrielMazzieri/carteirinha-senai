package com.senai.carteirinha_senai.feature.unidade_curricular.presentation

import com.senai.carteirinha_senai.feature.unidade_curricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)