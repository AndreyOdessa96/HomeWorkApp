package org.example;

import java.util.Date;

public class TestResult {
    private int totalTests;
    private int successfulTests;
    private int failedTests;
    private Date testRunTime;

    public TestResult(int totalTests, int successfulTests, int failedTests, Date testRunTime) {
        this.totalTests = totalTests;
        this.successfulTests = successfulTests;
        this.failedTests = failedTests;
        this.testRunTime = testRunTime;
    }

    public int getTotalTests() {
        return totalTests;
    }

    public int getSuccessfulTests() {
        return successfulTests;
    }

    public int getFailedTests() {
        return failedTests;
    }

    public Date getTestRunTime() {
        return testRunTime;
    }
    public boolean checkArray(int[] arr) {
        boolean hasOne = false;
        boolean hasFour = false;
        for (int i : arr) {
            if (i == 1) {
                hasOne = true;
            } else if (i == 4) {
                hasFour = true;
            } else {
                return false;
            }
        }
        return hasOne && hasFour;
    }
}

