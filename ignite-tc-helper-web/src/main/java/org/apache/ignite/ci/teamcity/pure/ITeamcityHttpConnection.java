/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.ci.teamcity.pure;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ignite.ci.web.rest.exception.ConflictException;

public interface ITeamcityHttpConnection {
    /**
     * @param basicAuthTok Basic auth token.
     * @param url Url.
     * @throws FileNotFoundException If not found (404) was returned from service.
     * @throws ConflictException If conflict (409) was returned from service.
     * @throws IllegalStateException if some unexpected HTTP error returned.
     */
    public InputStream sendGet(String basicAuthTok, String url) throws IOException;
}
