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

package org.gabsocial.validate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * A test class for the ByteValidator
 *
 * @author Gregory Brown (sysdevone)
 *
 */
public class ByteValidatorNegativeTest
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
    public void testMaxValue()
    {

        try
        {
            byte x = '5';
            byte max = '4';
            boolean retVal = Validate.defineByte(x).testMaxValue(max)
                    .throwValidationExceptionOnFail().validate();

            Assert.assertEquals(false, retVal);
        }
        catch (final ValidateException e)
        {
            Assert.assertTrue(true);
        }

    }
    
    @Test
    public void testMinLength()
    {
        
        try
        {
            byte x = '5';
            byte min = '7';
            boolean retVal = Validate.defineByte(x).testMinValue(min)
                    .throwValidationExceptionOnFail().validate();

            Assert.assertEquals(false, retVal);
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
            byte x = '5';
            byte y = '6';
            boolean retVal = Validate.defineByte(x).testEquals(y)
                    .throwValidationExceptionOnFail().validate();

            Assert.assertEquals(false, retVal);
        }
        catch (final ValidateException e)
        {
            Assert.assertTrue(true);
        }
        
    }
    
}