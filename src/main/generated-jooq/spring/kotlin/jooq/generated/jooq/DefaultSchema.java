/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import spring.kotlin.jooq.generated.jooq.tables.Artist;
import spring.kotlin.jooq.generated.jooq.tables.Music;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1539154067;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>artist</code>.
     */
    public final Artist ARTIST = spring.kotlin.jooq.generated.jooq.tables.Artist.ARTIST;

    /**
     * The table <code>music</code>.
     */
    public final Music MUSIC = spring.kotlin.jooq.generated.jooq.tables.Music.MUSIC;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Artist.ARTIST,
            Music.MUSIC);
    }
}
