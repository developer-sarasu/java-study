/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.sarasu.jdk8.try_with_resources;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TryWithResourcesTest
 * @author sarasu
 * @since 
 */
public class TryWithResourcesTest {
	private TryWithResources tryWithResources;

	@Before
	public void init() {
		this.tryWithResources = new TryWithResources();
	}

	@Test
	public void getResourcesFileStringTest() {
		String result;
		String filePath;

		given: {
			filePath = "/try_with_resources/Try-With-Resources.txt";
		}

		when: {
			result = tryWithResources.getResourcesFileString(filePath);
		}

		then: {
			assertEquals("this file is for Try With Resources Syntax Test.", result);
		}
	}
}
