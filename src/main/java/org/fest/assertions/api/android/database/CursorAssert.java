// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.database;

import android.database.Cursor;

/**
 * Assertions for {@link Cursor} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractCursorAssert}.
 */
public final class CursorAssert extends AbstractCursorAssert<CursorAssert, Cursor> {
  public CursorAssert(Cursor actual) {
    super(actual, CursorAssert.class);
  }
}
