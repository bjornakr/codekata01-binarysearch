package no.atferdssenteret.codekata01;

import java.util.Arrays;

public class RecursiveBinarySearch implements BinarySearch {
    private int valueToSearchFor;
    private int[] allValues;

    @Override
    public int chop(int valueToSearchFor, int[] allValues) {
	this.valueToSearchFor = valueToSearchFor;
	Arrays.sort(allValues);
	this.allValues = allValues;

	return searchForValue(0, allValues.length - 1);
    }

    private int searchForValue(int startPos, int stopPos) {
	if (startPos > stopPos) {
	    return VALUE_NOT_FOUND;
	}

	int middlePos = (startPos + stopPos) / 2;
	int middleValue = allValues[middlePos];

	if (valueToSearchFor > middleValue) {
	    return searchForValue(middlePos + 1, stopPos);
	}
	else if (valueToSearchFor < middleValue) {
	    return searchForValue(startPos, middlePos - 1);
	}
	else if (valueToSearchFor == middleValue) {
	    return middlePos;
	}
	else {
	    return VALUE_NOT_FOUND;
	}
    }
}
