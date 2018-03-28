/*
 * Copyright 2018 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.scheduler.spi.implementation;

import java.util.List;

import org.springframework.cloud.scheduler.spi.ScheduleInfo;
import org.springframework.cloud.scheduler.spi.Scheduler;
import org.springframework.cloud.scheduler.spi.core.ScheduleRequest;

/**
 * A default implementation of the {@link Scheduler} interface.
 *
 * @author Glenn Renfro
 */
public class SchedulerStub implements Scheduler {

	@Override
	public void schedule(ScheduleRequest scheduleRequest) {
		throw new UnsupportedOperationException("Interface is not implemented for schedule method.");
	}

	@Override
	public void unschedule(String scheduleName) {
		throw new UnsupportedOperationException("Interface is not implemented for unschedule method.");
	}

	@Override
	public  List<ScheduleInfo> list(String taskDefinitionName) {
		throw new UnsupportedOperationException("Interface is not implemented for list method.");
	}

	@Override
	public  List<ScheduleInfo> list() {
		throw new UnsupportedOperationException("Interface is not implemented for list method.");
	}
}
