package com.senai.carteirinha_senai.feature.unidade_curricular.data.repository

import com.senai.carteirinha_senai.feature.unidade_curricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}