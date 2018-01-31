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

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TryWithResources
 * @author sarasu
 * @since 
 */
public class TryWithResources {
	public String getResourcesFileString(String fileName) {
		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(this.getClass().getResource(fileName).toURI()))) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
				sb.append(line);
			}
		} catch (URISyntaxException ux) {
			System.out.println(ux.toString());
		} catch (IOException ix) {
			System.out.println(ix.toString());
		}

		return sb.toString();
	}
}
