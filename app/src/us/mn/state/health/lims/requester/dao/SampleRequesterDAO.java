/**
* The contents of this file are subject to the Mozilla Public License
* Version 1.1 (the "License"); you may not use this file except in
* compliance with the License. You may obtain a copy of the License at
* http://www.mozilla.org/MPL/
*
* Software distributed under the License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
* License for the specific language governing rights and limitations under
* the License.
*
* The Original Code is OpenELIS code.
*
* Copyright (C) CIRG, University of Washington, Seattle WA.  All Rights Reserved.
*
*/
package us.mn.state.health.lims.requester.dao;

import java.util.List;

import us.mn.state.health.lims.common.exception.LIMSRuntimeException;
import us.mn.state.health.lims.requester.valueholder.SampleRequester;


public interface SampleRequesterDAO{

	public boolean insertData(SampleRequester sampleRequester) throws LIMSRuntimeException;

	public List<SampleRequester> getRequestersForSampleId(String sampleId) throws LIMSRuntimeException;

    void updateData( SampleRequester sampleRequester )  throws LIMSRuntimeException;

    void insertOrUpdateData( SampleRequester sampleRequester )  throws LIMSRuntimeException;;

    void delete( SampleRequester sampleRequester  ) throws LIMSRuntimeException;
}
