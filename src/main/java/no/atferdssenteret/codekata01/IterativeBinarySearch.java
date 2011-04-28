package no.atferdssenteret.codekata01;

import java.util.Arrays;

public class IterativeBinarySearch implements BinarySearch {
    private int startPos;
    private int stopPos;

    @Override
    public int chop(int valueToSearchFor, int[] allValues) {
	Arrays.sort(allValues);
	startPos = 0;
	stopPos = allValues.length - 1;

	while (startPos <= stopPos) {
	    int result = searchForValue(valueToSearchFor, allValues);
	    if (result != VALUE_NOT_FOUND) {
		return result;
	    }
	}

	return VALUE_NOT_FOUND;
    }

    private int searchForValue(int valueToSearchFor, int[] allValues) {
	int middlePos = startPos + ((stopPos - startPos) / 2);
	int middleValue = allValues[middlePos];

	if (valueToSearchFor > middleValue) {
	    startPos = middlePos + 1;
	}
	else if (valueToSearchFor < middleValue) {
	    stopPos = middlePos - 1;
	}
	else if (valueToSearchFor == middleValue) {
	    return middlePos;
	}

	return VALUE_NOT_FOUND;
    }
}
