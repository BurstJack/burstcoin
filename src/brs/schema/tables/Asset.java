/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables;


import brs.schema.Db;
import brs.schema.Indexes;
import brs.schema.Keys;
import brs.schema.tables.records.AssetRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Asset extends TableImpl<AssetRecord> {

    private static final long serialVersionUID = -827757933;

    /**
     * The reference instance of <code>DB.asset</code>
     */
    public static final Asset ASSET = new Asset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssetRecord> getRecordType() {
        return AssetRecord.class;
    }

    /**
     * The column <code>DB.asset.db_id</code>.
     */
    public final TableField<AssetRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>DB.asset.id</code>.
     */
    public final TableField<AssetRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.asset.account_id</code>.
     */
    public final TableField<AssetRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.asset.name</code>.
     */
    public final TableField<AssetRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>DB.asset.description</code>.
     */
    public final TableField<AssetRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>DB.asset.quantity</code>.
     */
    public final TableField<AssetRecord, Long> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.asset.decimals</code>.
     */
    public final TableField<AssetRecord, Byte> DECIMALS = createField("decimals", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>DB.asset.height</code>.
     */
    public final TableField<AssetRecord, Integer> HEIGHT = createField("height", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>DB.asset</code> table reference
     */
    public Asset() {
        this(DSL.name("asset"), null);
    }

    /**
     * Create an aliased <code>DB.asset</code> table reference
     */
    public Asset(String alias) {
        this(DSL.name(alias), ASSET);
    }

    /**
     * Create an aliased <code>DB.asset</code> table reference
     */
    public Asset(Name alias) {
        this(alias, ASSET);
    }

    private Asset(Name alias, Table<AssetRecord> aliased) {
        this(alias, aliased, null);
    }

    private Asset(Name alias, Table<AssetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ASSET_ASSET_ACCOUNT_ID_IDX, Indexes.ASSET_ASSET_ID_IDX, Indexes.ASSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AssetRecord, Long> getIdentity() {
        return Keys.IDENTITY_ASSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssetRecord> getPrimaryKey() {
        return Keys.KEY_ASSET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssetRecord>> getKeys() {
        return Arrays.<UniqueKey<AssetRecord>>asList(Keys.KEY_ASSET_PRIMARY, Keys.KEY_ASSET_ASSET_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Asset as(String alias) {
        return new Asset(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Asset as(Name alias) {
        return new Asset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Asset rename(String name) {
        return new Asset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Asset rename(Name name) {
        return new Asset(name, null);
    }
}
