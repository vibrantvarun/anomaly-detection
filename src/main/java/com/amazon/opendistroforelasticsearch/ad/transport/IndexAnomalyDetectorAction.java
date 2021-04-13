/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.opendistroforelasticsearch.ad.transport;

import org.opensearch.action.ActionType;

import com.amazon.opendistroforelasticsearch.ad.constant.CommonValue;

public class IndexAnomalyDetectorAction extends ActionType<IndexAnomalyDetectorResponse> {
    // External Action which used for public facing RestAPIs.
    public static final String NAME = CommonValue.EXTERNAL_ACTION_PREFIX + "detector/write";
    public static final IndexAnomalyDetectorAction INSTANCE = new IndexAnomalyDetectorAction();

    private IndexAnomalyDetectorAction() {
        super(NAME, IndexAnomalyDetectorResponse::new);
    }

}