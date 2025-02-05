/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.marsphotos.fake
import com.example.marsphotos.model.MarsPhoto
object FakeDataSource {
    private const val id1 = "10000000000"
    private const val id2 = "20000000000"
    private const val img1 = "https://mars.jpl.nasa.gov/msl-raw-images/msss/01000/mcam/10000000000.jpg"
    private const val img2 = "https://mars.jpl.nasa.gov/msl-raw-images/msss/01000/mcam/20000000000.jpg"
    val photosList = listOf(
        MarsPhoto(
            id = id1,
            imgSrc = img1
        ),
        MarsPhoto(
            id = id2,
            imgSrc = img2
        )
    )
}