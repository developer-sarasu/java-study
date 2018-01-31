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
package dev.sarasu.design_patterns.creational.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dev.sarasu.design_patterns.creational.singletone.LazyLoadingSingleton;

/**
 *
 * @author sarasu
 * @since 
 */
public class LazyLoadingSingletonTest {
	@Test
	public void singletonTest() {
		LazyLoadingSingleton singleton1;
		LazyLoadingSingleton singleton2;

		given: {

		}

		when: {
			singleton1 = LazyLoadingSingleton.getInstance();
			singleton2 = LazyLoadingSingleton.getInstance();
		}

		then: {
			assertTrue(singleton1 == singleton2);
			assertTrue(singleton1.equals(singleton2));
		}
	}
}
