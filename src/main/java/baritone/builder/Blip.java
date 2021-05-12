/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package baritone.builder;

/**
 * 1/16th of a block
 * <p>
 * Why do this? Several reasons:
 * <p>
 * • No floating point inaccuracy. I got incredibly annoyed with simple stuff like >1 and <1 being randomly wrong. It helps with stuff like slab calculations, 0.5 block steps, etc
 * <p>
 * • It's obscenely fast
 */
public class Blip {

    public static final int PER_BLOCK = 16;
    public static final int FULL_BLOCK = PER_BLOCK;
    public static final double RATIO = 0.0625;
    public static final int HALF_BLOCK = 8;
    public static final int PLAYER_HEIGHT = 29;
    public static final int TWO_BLOCKS = 2 * FULL_BLOCK;
}
