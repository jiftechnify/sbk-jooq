package net.jiftech.sbkjooq.repository

import net.jiftech.sbkjooq.model.Artist

interface ArtistRepository {
    /**
     * 全件取得
     */
    fun findAll(): List<Artist>
}