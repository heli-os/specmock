/*
 * Copyright 2023 SpecMock
 * (c) 2023 SpecMock Contributors
 * SPDX-License-Identifier: Apache-2.0
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.specmock.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HttpRouteTest {
    @Test
    void isSupportMethod() {
        assertThat(HttpRoute.get("/get").getMethod()).isEqualTo(HttpMethod.GET);
        assertThat(HttpRoute.post("/post").getMethod()).isEqualTo(HttpMethod.POST);
        assertThat(HttpRoute.put("/put").getMethod()).isEqualTo(HttpMethod.PUT);
        assertThat(HttpRoute.patch("/pathch").getMethod()).isEqualTo(HttpMethod.PATCH);
        assertThat(HttpRoute.delete("/delete").getMethod()).isEqualTo(HttpMethod.DELETE);
    }
}
