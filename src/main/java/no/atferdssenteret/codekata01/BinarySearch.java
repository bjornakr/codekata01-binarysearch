package no.atferdssenteret.codekata01;

public interface BinarySearch {
    public final static int VALUE_NOT_FOUND = -1;

    /**
     * 
     * Searches for a value in an array of integers.
     * 
     * @param valueToSearchFor The value to search for
     * @param allValues The array to search in 
     * @return The position of the value in the array
     */
    public int chop(int valueToSearchFor, int[] allValues);
}
