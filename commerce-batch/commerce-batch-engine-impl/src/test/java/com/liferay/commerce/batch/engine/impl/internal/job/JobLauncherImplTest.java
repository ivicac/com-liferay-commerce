/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.batch.engine.impl.internal.job;

import com.liferay.commerce.batch.engine.api.item.ItemReader;
import com.liferay.commerce.batch.engine.api.item.ItemWriter;
import com.liferay.commerce.batch.engine.api.job.Job;
import com.liferay.commerce.batch.engine.api.job.JobExecution;
import com.liferay.commerce.batch.engine.api.job.JobInstance;
import com.liferay.commerce.batch.engine.api.job.JobParameters;
import com.liferay.commerce.batch.engine.impl.internal.concurrent.BlockingExecutor;

import org.junit.Assert;
import org.junit.Test;

import org.mockito.Mockito;

/**
 * @author Ivica Cardic
 */
public class JobLauncherImplTest {

	@Test
	public void testRun() {
		BlockingExecutor blockingExecutor = Mockito.mock(
			BlockingExecutor.class);

		JobLauncherImpl jobLauncherImpl = new JobLauncherImpl(blockingExecutor);

		Job job = new JobImpl(
			"id", "name", Mockito.mock(ItemReader.class),
			Mockito.mock(ItemWriter.class));

		JobExecution jobExecution = jobLauncherImpl.run(
			job, new JobParameters());

		JobInstance jobInstance = jobExecution.getJobInstance();

		Assert.assertTrue(jobLauncherImpl.isJobActive(jobInstance.getJobKey()));
	}

}