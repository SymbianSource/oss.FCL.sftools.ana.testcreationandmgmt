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


package com.symbian.driver.provider;

import com.symbian.driver.util.DriverAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DriverItemProviderAdapterFactory extends DriverAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.Build} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildItemProvider buildItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.Build}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBuildAdapter() {
		if (buildItemProvider == null) {
			buildItemProvider = new BuildItemProvider(this);
		}

		return buildItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.CmdPC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdPCItemProvider cmdPCItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.CmdPC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCmdPCAdapter() {
		if (cmdPCItemProvider == null) {
			cmdPCItemProvider = new CmdPCItemProvider(this);
		}

		return cmdPCItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.CmdSymbian} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdSymbianItemProvider cmdSymbianItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.CmdSymbian}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCmdSymbianAdapter() {
		if (cmdSymbianItemProvider == null) {
			cmdSymbianItemProvider = new CmdSymbianItemProvider(this);
		}

		return cmdSymbianItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.Driver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverItemProvider driverItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.Driver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDriverAdapter() {
		if (driverItemProvider == null) {
			driverItemProvider = new DriverItemProvider(this);
		}

		return driverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.DriverInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverInfoItemProvider driverInfoItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.DriverInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDriverInfoAdapter() {
		if (driverInfoItemProvider == null) {
			driverInfoItemProvider = new DriverInfoItemProvider(this);
		}

		return driverInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.ExecuteOnPC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteOnPCItemProvider executeOnPCItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.ExecuteOnPC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecuteOnPCAdapter() {
		if (executeOnPCItemProvider == null) {
			executeOnPCItemProvider = new ExecuteOnPCItemProvider(this);
		}

		return executeOnPCItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.ExecuteOnSymbian} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteOnSymbianItemProvider executeOnSymbianItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.ExecuteOnSymbian}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecuteOnSymbianAdapter() {
		if (executeOnSymbianItemProvider == null) {
			executeOnSymbianItemProvider = new ExecuteOnSymbianItemProvider(this);
		}

		return executeOnSymbianItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.FlashROM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlashROMItemProvider flashROMItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.FlashROM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlashROMAdapter() {
		if (flashROMItemProvider == null) {
			flashROMItemProvider = new FlashROMItemProvider(this);
		}

		return flashROMItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.Info} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoItemProvider infoItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.Info}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInfoAdapter() {
		if (infoItemProvider == null) {
			infoItemProvider = new InfoItemProvider(this);
		}

		return infoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.Reference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceItemProvider referenceItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceAdapter() {
		if (referenceItemProvider == null) {
			referenceItemProvider = new ReferenceItemProvider(this);
		}

		return referenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.RetrieveFromSymbian} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetrieveFromSymbianItemProvider retrieveFromSymbianItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.RetrieveFromSymbian}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRetrieveFromSymbianAdapter() {
		if (retrieveFromSymbianItemProvider == null) {
			retrieveFromSymbianItemProvider = new RetrieveFromSymbianItemProvider(this);
		}

		return retrieveFromSymbianItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.Rtest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtestItemProvider rtestItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.Rtest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtestAdapter() {
		if (rtestItemProvider == null) {
			rtestItemProvider = new RtestItemProvider(this);
		}

		return rtestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.TestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseItemProvider testCaseItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.TestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestCaseAdapter() {
		if (testCaseItemProvider == null) {
			testCaseItemProvider = new TestCaseItemProvider(this);
		}

		return testCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.TestCasesList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCasesListItemProvider testCasesListItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.TestCasesList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestCasesListAdapter() {
		if (testCasesListItemProvider == null) {
			testCasesListItemProvider = new TestCasesListItemProvider(this);
		}

		return testCasesListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.TestExecuteScript} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestExecuteScriptItemProvider testExecuteScriptItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.TestExecuteScript}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestExecuteScriptAdapter() {
		if (testExecuteScriptItemProvider == null) {
			testExecuteScriptItemProvider = new TestExecuteScriptItemProvider(this);
		}

		return testExecuteScriptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.Transfer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferItemProvider transferItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.Transfer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransferAdapter() {
		if (transferItemProvider == null) {
			transferItemProvider = new TransferItemProvider(this);
		}

		return transferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.TransferToSymbian} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferToSymbianItemProvider transferToSymbianItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.TransferToSymbian}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransferToSymbianAdapter() {
		if (transferToSymbianItemProvider == null) {
			transferToSymbianItemProvider = new TransferToSymbianItemProvider(this);
		}

		return transferToSymbianItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.StartTrace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTraceItemProvider startTraceItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.StartTrace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartTraceAdapter() {
		if (startTraceItemProvider == null) {
			startTraceItemProvider = new StartTraceItemProvider(this);
		}

		return startTraceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.StopTrace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopTraceItemProvider stopTraceItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.StopTrace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStopTraceAdapter() {
		if (stopTraceItemProvider == null) {
			stopTraceItemProvider = new StopTraceItemProvider(this);
		}

		return stopTraceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (buildItemProvider != null) buildItemProvider.dispose();
		if (cmdPCItemProvider != null) cmdPCItemProvider.dispose();
		if (cmdSymbianItemProvider != null) cmdSymbianItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (driverItemProvider != null) driverItemProvider.dispose();
		if (driverInfoItemProvider != null) driverInfoItemProvider.dispose();
		if (executeOnPCItemProvider != null) executeOnPCItemProvider.dispose();
		if (executeOnSymbianItemProvider != null) executeOnSymbianItemProvider.dispose();
		if (flashROMItemProvider != null) flashROMItemProvider.dispose();
		if (infoItemProvider != null) infoItemProvider.dispose();
		if (referenceItemProvider != null) referenceItemProvider.dispose();
		if (retrieveFromSymbianItemProvider != null) retrieveFromSymbianItemProvider.dispose();
		if (rtestItemProvider != null) rtestItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (testCaseItemProvider != null) testCaseItemProvider.dispose();
		if (testCasesListItemProvider != null) testCasesListItemProvider.dispose();
		if (testExecuteScriptItemProvider != null) testExecuteScriptItemProvider.dispose();
		if (transferItemProvider != null) transferItemProvider.dispose();
		if (transferToSymbianItemProvider != null) transferToSymbianItemProvider.dispose();
		if (startTraceItemProvider != null) startTraceItemProvider.dispose();
		if (stopTraceItemProvider != null) stopTraceItemProvider.dispose();
	}

}
