/*
 * ******************************************************************************
 *   Copyright 2016 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ****************************************************************************
 */

package com.spectralogic.ds3contractcomparator;

import com.spectralogic.ds3autogen.api.models.apispec.Ds3Request;
import com.spectralogic.ds3contractcomparator.models.request.AbstractDs3RequestDiff;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

/**
 * Interface for comparing two {@link Ds3Request}
 */
@FunctionalInterface
public interface Ds3RequestComparator {

    /**
     * Compares two {@link Ds3Request} and creates a {@link AbstractDs3RequestDiff} containing their differences.
     * @param oldRequest the older API version of the {@link Ds3Request} or null if it does not exist in the old version
     * @param newRequest the newer API version of the {@link Ds3Request} or null if it does not exist in the new version
     */
    AbstractDs3RequestDiff compare(@Nullable final Ds3Request oldRequest, @Nullable final Ds3Request newRequest);
}