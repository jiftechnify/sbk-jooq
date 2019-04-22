package net.jiftech.sbkjooq.repository.impl

import net.jiftech.sbkjooq.model.Artist
import net.jiftech.sbkjooq.repository.ArtistRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables.ARTIST
import spring.kotlin.jooq.generated.jooq.tables.records.ArtistRecord

@Repository
class ArtistRepositoryImpl(private val context: DSLContext): ArtistRepository {
    override fun findAll(): List<Artist> {
        return context
                .select()
                .from(ARTIST)
                .fetch()
                .map { toModel(it as ArtistRecord) }
    }

    private fun toModel(r: ArtistRecord): Artist {
        return Artist(r.id, r.name)
    }
}