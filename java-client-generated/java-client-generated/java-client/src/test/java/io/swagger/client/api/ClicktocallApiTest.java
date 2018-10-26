/*
 * Nokia TAS Call Direction API
 * The first version of the Nokia TAS Call Direction API is an exciting step forward towards making it easier for developers to have open access to their operator's network.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: openapi.support@nokia.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ClickToCall1;
import io.swagger.client.model.ClickToCallResponse1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClicktocallApi
 */
@Ignore
public class ClicktocallApiTest {

    private final ClicktocallApi api = new ClicktocallApi();

    
    /**
     * Create a click to call request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clickToCallTest() throws ApiException {
        ClickToCall1 clickToCall = null;
        ClickToCallResponse1 response = api.clickToCall(clickToCall);

        // TODO: test validations
    }
    
}