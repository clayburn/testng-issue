package com.example;

import org.testng.IExecutorServiceFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class MyThreadPoolFactory implements IExecutorServiceFactory {
    @Override
    public ExecutorService create(int corePoolSize,
                                  int maximumPoolSize,
                                  long keepAliveTime,
                                  TimeUnit unit,
                                  BlockingQueue<Runnable> workQueue,
                                  ThreadFactory threadFactory) {
        return Executors.newSingleThreadExecutor(threadFactory);
    }
}
