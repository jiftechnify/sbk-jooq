package net.jiftech.sbkjooq.repository.impl

import net.jiftech.sbkjooq.repository.ArtistRepository

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ArtistRepositoryImplTest {
    @Autowired
    lateinit var repository: ArtistRepository

    @Test
    fun findAll() {
        val result = repository.findAll()

        assertThat(result.size).isEqualTo(3)
        assertThat(result[0].name).isEqualTo("Steeve Aoki")
        assertThat(result[1].name).isEqualTo("Skrillex")
        assertThat(result[2].name).isEqualTo("Avicii")
    }
}
