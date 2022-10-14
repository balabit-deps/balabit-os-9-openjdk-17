/*
 * @test /nodynamiccopyright/
 * @bug 4309152
 * @summary Compiler silently generates bytecode that exceeds VM limits
 * @author gafter
 *
 * @compile/fail/ref=ArrayDims4.out -XDrawDiagnostics ArrayDims4.java
 */

class ArrayDims4 {
    static Object y = new Object
        [1][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][][][][][]
        [][][][][][]; // 256 = too many
    public static void main(String[] args) {
    }
}