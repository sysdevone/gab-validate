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
 * A test class for the ArrayValidator
 *
 * @author Gregory Brown (sysdevone)
 *
 */
public class ArrayValidatorTest
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
    public void testMaxLength()
    {
        String[] strArray1 = { "Hello", "World", "is", "awesome" };
        try
        {
            boolean retVal = Validate.defineArray(strArray1).testMaxLength(4)
                    .throwExceptionOnFailedValidation().validate();

            Assert.assertTrue(retVal);
        }
        catch (final ValidateException e)
        {
            Assert.fail(e.toString());
        }

    }

    @Test
    public void testMinLength()
    {
        String[] strArray1 = { "Hello", "World", "is", "awesome" };
        try
        {
            boolean retVal = Validate.defineArray(strArray1).testMinLength(4)
                    .throwExceptionOnFailedValidation().validate();

            Assert.assertTrue(retVal);
        }
        catch (final ValidateException e)
        {
            Assert.fail(e.toString());
        }

    }

    @Test
    public void testNotNullEmpty()
    {

        String[] strArray1 = { "Hello", "World", "is", "awesome" };
        try
        {
            boolean retVal = Validate.defineArray(strArray1).testNotNullEmpty()
                    .throwExceptionOnFailedValidation().validate();

            Assert.assertTrue(retVal);
        }
        catch (final ValidateException e)
        {
            Assert.fail(e.toString());
        }

    }
    

    @Test
    public void testNotNull()
    {

        String[] strArray1 = { "Hello", "World", "is", "awesome" };
        try
        {
            boolean retVal = Validate.defineArray(strArray1).testNotNull()
                    .throwExceptionOnFailedValidation().validate();

            Assert.assertTrue(retVal);
        }
        catch (final ValidateException e)
        {
            Assert.fail(e.toString());
        }

    }
    
    @Test
    public void testEquals()
    {
        String[] strArray1 = { "Hello", "World", "is", "awesome" };
        String[] strArray2 = { "Hello", "World", "is", "awesome" };
        try
        {
            boolean retVal = Validate.defineArray(strArray1).testEquals(strArray2)
                    .throwExceptionOnFailedValidation().validate();

            Assert.assertTrue(retVal);
        }
        catch (final ValidateException e)
        {
            Assert.fail(e.toString());
        }

    }
    
        
}