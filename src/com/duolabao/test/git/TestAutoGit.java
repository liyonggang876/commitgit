package com.duolabao.test.git;

public class TestAutoGit {
    private static TestAutoGit ourInstance = new TestAutoGit();

    public static TestAutoGit getInstance() {
        return ourInstance;
    }

    private TestAutoGit() {
    }
}
