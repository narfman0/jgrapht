/* ==========================================
 * JGraphT : a free Java graph-theory library
 * ==========================================
 *
 * Project Info:  http://jgrapht.sourceforge.net/
 * Project Lead:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
 *
 * (C) Copyright 2003-2004, by Barak Naveh and Contributors.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */
package org.jgrapht.experimental.heap;

import java.util.*;


/**
 * .
 *
 * @author Michael Behrisch
 * @version 1.0
 */
public interface Heap
{

    //~ Methods ---------------------------------------------------------------

    /**
     * .
     *
     * @return
     */
    public boolean isEmpty();

    /**
     * .
     *
     * @param x
     */
    public void add(Object x);

    /**
     * .
     *
     * @param c
     */
    public void addAll(Collection c);

    /**
     * .
     */
    public void clear();

    /**
     * .
     *
     * @return
     */
    public Object extractTop();

    /**
     * .
     *
     * @return
     */
    public int size();

    /**
     * .
     *
     * @param x
     */
    public void update(Object x);
}
