/*
 * Copyright 2023-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.http.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.util.concurrent.Executor;

import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.http.HttpMethod;
import org.springframework.util.Assert;


/**
 * {@link ClientHttpRequestFactory} implementation based on the Java
 * {@link HttpClient}.
 *
 * @author Marten Deinum
 * @author Arjen Poutsma
 * @since 6.1
 */
public class JdkClientHttpRequestFactory implements ClientHttpRequestFactory {

	private final HttpClient httpClient;

	private final Executor executor;


	/**
	 * Create a new instance of the {@code JdkClientHttpRequestFactory}
	 * with a default {@link HttpClient}.
	 */
	public JdkClientHttpRequestFactory() {
		this(HttpClient.newHttpClient());
	}

	/**
	 * Create a new instance of the {@code JdkClientHttpRequestFactory} based on
	 * the given {@link HttpClient}.
	 * @param httpClient the client to base on
	 */
	public JdkClientHttpRequestFactory(HttpClient httpClient) {
		Assert.notNull(httpClient, "HttpClient is required");
		this.httpClient = httpClient;
		this.executor = httpClient.executor().orElseGet(SimpleAsyncTaskExecutor::new);
	}

	/**
	 * Create a new instance of the {@code JdkClientHttpRequestFactory} based on
	 * the given {@link HttpClient} and {@link Executor}.
	 * @param httpClient the client to base on
	 * @param executor the executor to use for blocking write operations
	 */
	public JdkClientHttpRequestFactory(HttpClient httpClient, Executor executor) {
		Assert.notNull(httpClient, "HttpClient is required");
		Assert.notNull(executor, "Executor must not be null");
		this.httpClient = httpClient;
		this.executor = executor;
	}


	@Override
	public ClientHttpRequest createRequest(URI uri, HttpMethod httpMethod) throws IOException {
		return new JdkClientHttpRequest(this.httpClient, uri, httpMethod, this.executor);
	}

}
