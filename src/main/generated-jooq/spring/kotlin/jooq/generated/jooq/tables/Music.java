/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import spring.kotlin.jooq.generated.jooq.DefaultSchema;
import spring.kotlin.jooq.generated.jooq.Indexes;
import spring.kotlin.jooq.generated.jooq.Keys;
import spring.kotlin.jooq.generated.jooq.tables.records.MusicRecord;


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
public class Music extends TableImpl<MusicRecord> {

    private static final long serialVersionUID = -1493246579;

    /**
     * The reference instance of <code>music</code>
     */
    public static final Music MUSIC = new Music();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MusicRecord> getRecordType() {
        return MusicRecord.class;
    }

    /**
     * The column <code>music.id</code>.
     */
    public final TableField<MusicRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>music.artist_id</code>.
     */
    public final TableField<MusicRecord, Integer> ARTIST_ID = createField("artist_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>music.title</code>.
     */
    public final TableField<MusicRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>music</code> table reference
     */
    public Music() {
        this(DSL.name("music"), null);
    }

    /**
     * Create an aliased <code>music</code> table reference
     */
    public Music(String alias) {
        this(DSL.name(alias), MUSIC);
    }

    /**
     * Create an aliased <code>music</code> table reference
     */
    public Music(Name alias) {
        this(alias, MUSIC);
    }

    private Music(Name alias, Table<MusicRecord> aliased) {
        this(alias, aliased, null);
    }

    private Music(Name alias, Table<MusicRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Music(Table<O> child, ForeignKey<O, MusicRecord> key) {
        super(child, key, MUSIC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MUSIC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MusicRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MUSIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MusicRecord> getPrimaryKey() {
        return Keys.KEY_MUSIC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MusicRecord>> getKeys() {
        return Arrays.<UniqueKey<MusicRecord>>asList(Keys.KEY_MUSIC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Music as(String alias) {
        return new Music(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Music as(Name alias) {
        return new Music(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Music rename(String name) {
        return new Music(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Music rename(Name name) {
        return new Music(name, null);
    }
}