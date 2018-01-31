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
package dev.sarasu.jdk8.nio.file;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sarasu
 * @since 
 */
public class FileSystemTest {
	private FilesSystem filesSystem;

	@Before
	public void init() {
		this.filesSystem = new FilesSystem();
	}

	@Test
	public void getPathByStringTest() {
		String filePath;
		Path path;

		given: {
			filePath = "/resources/file_system/filesystem.txt";
		}
		when: {
			path = filesSystem.getPathByString(filePath);
		}
		then: {
			assertEquals("filesystem.txt", path.getFileName().toString());
		}
	}

	@Test
	public void getPathByURITest() throws URISyntaxException {
		URI uri;
		String filePath;
		Path path;

		given: {
			filePath = "file:/resources/file_system/filesystem.txt";
			uri = new URI(filePath);
		}
		when: {
			path = filesSystem.getPathByURI(uri);
		}
		then: {
			assertEquals("filesystem.txt", path.getFileName().toString());
		}
	}
}
