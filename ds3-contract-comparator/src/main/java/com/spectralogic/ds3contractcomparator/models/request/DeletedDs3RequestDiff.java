/*
 * ******************************************************************************
 *   Copyright 2016-2017 Spectra Logic Corporation. All Rights Reserved.
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

package com.spectralogic.ds3contractcomparator.models.request;

import com.spectralogic.ds3autogen.api.models.apispec.Ds3ApiSpec;
import com.spectralogic.ds3autogen.api.models.apispec.Ds3Request;

/**
 * Represents a Ds3Request that exists in the older {@link Ds3ApiSpec} but
 * does not exist in the newer {@link Ds3ApiSpec}
 */
public class DeletedDs3RequestDiff extends AbstractDs3RequestDiff {
    public DeletedDs3RequestDiff(final Ds3Request ds3Request) {
        super(ds3Request, null);
    }

    @Override
    public Ds3Request getNewDs3Request() {
        throw new UnsupportedOperationException("The new Ds3ApiSpec did not contain request handler " + getOldDs3Request().getName());
    }
}
