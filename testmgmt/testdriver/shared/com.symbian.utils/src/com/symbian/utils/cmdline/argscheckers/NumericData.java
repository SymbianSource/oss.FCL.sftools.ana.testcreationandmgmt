/*
* Copyright (c) 2005-2009 Nokia Corporation and/or its subsidiary(-ies).
* All rights reserved.
* This component and the accompanying materials are made available
* under the terms of "Eclipse Public License v1.0"
* which accompanies this distribution, and is available
* at the URL "http://www.eclipse.org/legal/epl-v10.html".
*
* Initial Contributors:
* Nokia Corporation - initial contribution.
*
* Contributors:
*
* Description: 
*
*/


package com.symbian.utils.cmdline.argscheckers;

import org.apache.commons.cli.ParseException;

/**
 * Checks that a parameter is numeric.
 * @author EngineeringTools
 */
public class NumericData implements DataAcceptable {

    /** {@inheritDoc}
     * @see com.symbian.utils.cmdline.argscheckers.DataAcceptable#check(java.lang.String)
     * @param aString {@inheritDoc}
     * @throws ParseException {@inheritDoc}
     */
    public void check(final String aString) throws ParseException {
        try {
            Integer.parseInt(aString);
        } catch (Exception lException) {
            throw new ParseException("non numeric parameter '" + aString + "'");
        }
    }
}
