/*
 * This file is generated by jOOQ.
 */
package ru.panic.generatedClasses.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.panic.generatedClasses.Keys;
import ru.panic.generatedClasses.Public;
import ru.panic.generatedClasses.tables.records.GamesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Games extends TableImpl<GamesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.games</code>
     */
    public static final Games GAMES = new Games();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GamesRecord> getRecordType() {
        return GamesRecord.class;
    }

    /**
     * The column <code>public.games.id</code>.
     */
    public final TableField<GamesRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.games.amount</code>.
     */
    public final TableField<GamesRecord, Double> AMOUNT = createField(DSL.name("amount"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.games.currency</code>.
     */
    public final TableField<GamesRecord, String> CURRENCY = createField(DSL.name("currency"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.games.game</code>.
     */
    public final TableField<GamesRecord, String> GAME = createField(DSL.name("game"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.games.game_state</code>.
     */
    public final TableField<GamesRecord, String> GAME_STATE = createField(DSL.name("game_state"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.games.timestamp</code>.
     */
    public final TableField<GamesRecord, Long> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.games.user_id</code>.
     */
    public final TableField<GamesRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.games.username</code>.
     */
    public final TableField<GamesRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Games(Name alias, Table<GamesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Games(Name alias, Table<GamesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.games</code> table reference
     */
    public Games(String alias) {
        this(DSL.name(alias), GAMES);
    }

    /**
     * Create an aliased <code>public.games</code> table reference
     */
    public Games(Name alias) {
        this(alias, GAMES);
    }

    /**
     * Create a <code>public.games</code> table reference
     */
    public Games() {
        this(DSL.name("games"), null);
    }

    public <O extends Record> Games(Table<O> child, ForeignKey<O, GamesRecord> key) {
        super(child, key, GAMES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<GamesRecord, Long> getIdentity() {
        return (Identity<GamesRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<GamesRecord> getPrimaryKey() {
        return Keys.GAMES_PKEY;
    }

    @Override
    public List<Check<GamesRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("games_currency_check"), "(((currency)::text = ANY ((ARRAY['BTC'::character varying, 'ETH'::character varying, 'LTC'::character varying, 'TETHER_ERC20'::character varying, 'TRX'::character varying, 'MATIC'::character varying, 'XRP'::character varying, 'TON'::character varying])::text[])))", true),
            Internal.createCheck(this, DSL.name("games_game_check"), "(((game)::text = ANY ((ARRAY['DICE'::character varying, 'MINER'::character varying])::text[])))", true),
            Internal.createCheck(this, DSL.name("games_game_state_check"), "(((game_state)::text = ANY ((ARRAY['LOSE'::character varying, 'WIN'::character varying])::text[])))", true)
        );
    }

    @Override
    public Games as(String alias) {
        return new Games(DSL.name(alias), this);
    }

    @Override
    public Games as(Name alias) {
        return new Games(alias, this);
    }

    @Override
    public Games as(Table<?> alias) {
        return new Games(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Games rename(String name) {
        return new Games(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Games rename(Name name) {
        return new Games(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Games rename(Table<?> name) {
        return new Games(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Double, String, String, String, Long, Long, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super Double, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super Double, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
