/*****************************************************************************************
 *
 * Copyright 2015 Gregory Brown. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 *****************************************************************************************
 */

package com.gabstudios.validate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 *
 *
 * @author Gregory Brown (sysdevone)
 *
 */
public class BooleanValidatorNegativeTest
{
    @Before
    public void setUp()
    {
        //
    }
    
    @After
    public void tearDown()
    {
        
    }
    
    
    @Test
    public void testTrue()
    {
        
        try
        {
            Validate.defineBoolean(true).testFalse().throwValidationExceptionOnFail().validate();
            
            Assert.fail();
        }
        catch (final ValidateException e)
        {
            Assert.assertTrue(true);
        }
        
    }
    
    @Test
    public void testFalse()
    {
        
        try
        {
            Validate.defineBoolean(false).testTrue().throwValidationExceptionOnFail()
                    .validate();
            
            Assert.fail();
        }
        catch (final ValidateException e)
        {
            Assert.assertTrue(true);
        }
        
    }
    
    @Test
    public void testEquals()
    {
        
        try
        {
            Validate.defineBoolean(false).testEquals(true).throwValidationExceptionOnFail()
                    .validate();
            
            Assert.fail();
        }
        catch (final ValidateException e)
        {
            Assert.assertTrue(true);
        }
        
    }
    
    @Test
    public void testEquals2()
    {
        
        try
        {
            Validate.defineBoolean(true).testEquals(false)
                    .throwValidationExceptionOnFail().validate();
            
            Assert.fail();
        }
        catch (final ValidateException e)
        {
            Assert.assertTrue(true);
        }
        
    }
    
}
