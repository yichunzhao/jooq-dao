/*
 * This file is generated by jOOQ.
 */
package com.ynz.demo.jooqdao.model;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.book_id_seq</code>
     */
    public static final Sequence<Integer> BOOK_ID_SEQ = Internal.createSequence("book_id_seq", Public.PUBLIC, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);
}
