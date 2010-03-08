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




package com.symbian.driver.report.provider;

import com.symbian.driver.report.util.ReportAdapterFactory;

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
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
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
public class ReportItemProviderAdapterFactory extends ReportAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	protected Collection<Class<?>> supportedTypes = new ArrayList<Class<?>>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ReportItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.BaseReport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseReportItemProvider baseReportItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.BaseReport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBaseReportAdapter() {
		if (baseReportItemProvider == null) {
			baseReportItemProvider = new BaseReportItemProvider(this);
		}

		return baseReportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.ExceptionReport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionReportItemProvider exceptionReportItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.ExceptionReport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createExceptionReportAdapter() {
		if (exceptionReportItemProvider == null) {
			exceptionReportItemProvider = new ExceptionReportItemProvider(this);
		}

		return exceptionReportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.GenericReport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericReportItemProvider genericReportItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.GenericReport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createGenericReportAdapter() {
		if (genericReportItemProvider == null) {
			genericReportItemProvider = new GenericReportItemProvider(this);
		}

		return genericReportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoItemProvider infoItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInfoAdapter() {
		if (infoItemProvider == null) {
			infoItemProvider = new InfoItemProvider(this);
		}

		return infoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.Report} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportItemProvider reportItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.Report}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createReportAdapter() {
		if (reportItemProvider == null) {
			reportItemProvider = new ReportItemProvider(this);
		}

		return reportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.ReportInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportInfoItemProvider reportInfoItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.ReportInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createReportInfoAdapter() {
		if (reportInfoItemProvider == null) {
			reportInfoItemProvider = new ReportInfoItemProvider(this);
		}

		return reportInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.TefReport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TefReportItemProvider tefReportItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.TefReport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTefReportAdapter() {
		if (tefReportItemProvider == null) {
			tefReportItemProvider = new TefReportItemProvider(this);
		}

		return tefReportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.TefTestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TefTestCaseItemProvider tefTestCaseItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.TefTestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTefTestCaseAdapter() {
		if (tefTestCaseItemProvider == null) {
			tefTestCaseItemProvider = new TefTestCaseItemProvider(this);
		}

		return tefTestCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.TefTestCaseSummary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TefTestCaseSummaryItemProvider tefTestCaseSummaryItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.TefTestCaseSummary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTefTestCaseSummaryAdapter() {
		if (tefTestCaseSummaryItemProvider == null) {
			tefTestCaseSummaryItemProvider = new TefTestCaseSummaryItemProvider(this);
		}

		return tefTestCaseSummaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.TefTestRunWsProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TefTestRunWsProgramItemProvider tefTestRunWsProgramItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.TefTestRunWsProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTefTestRunWsProgramAdapter() {
		if (tefTestRunWsProgramItemProvider == null) {
			tefTestRunWsProgramItemProvider = new TefTestRunWsProgramItemProvider(this);
		}

		return tefTestRunWsProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.TefTestRunWsProgramSummary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TefTestRunWsProgramSummaryItemProvider tefTestRunWsProgramSummaryItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.TefTestRunWsProgramSummary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTefTestRunWsProgramSummaryAdapter() {
		if (tefTestRunWsProgramSummaryItemProvider == null) {
			tefTestRunWsProgramSummaryItemProvider = new TefTestRunWsProgramSummaryItemProvider(this);
		}

		return tefTestRunWsProgramSummaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.TefTestStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TefTestStepItemProvider tefTestStepItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.TefTestStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTefTestStepAdapter() {
		if (tefTestStepItemProvider == null) {
			tefTestStepItemProvider = new TefTestStepItemProvider(this);
		}

		return tefTestStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.symbian.driver.report.TefTestStepSummary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TefTestStepSummaryItemProvider tefTestStepSummaryItemProvider;

	/**
	 * This creates an adapter for a {@link com.symbian.driver.report.TefTestStepSummary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTefTestStepSummaryAdapter() {
		if (tefTestStepSummaryItemProvider == null) {
			tefTestStepSummaryItemProvider = new TefTestStepSummaryItemProvider(this);
		}

		return tefTestStepSummaryItemProvider;
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
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
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
		if (baseReportItemProvider != null) baseReportItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (exceptionReportItemProvider != null) exceptionReportItemProvider.dispose();
		if (genericReportItemProvider != null) genericReportItemProvider.dispose();
		if (infoItemProvider != null) infoItemProvider.dispose();
		if (reportItemProvider != null) reportItemProvider.dispose();
		if (reportInfoItemProvider != null) reportInfoItemProvider.dispose();
		if (tefReportItemProvider != null) tefReportItemProvider.dispose();
		if (tefTestCaseItemProvider != null) tefTestCaseItemProvider.dispose();
		if (tefTestCaseSummaryItemProvider != null) tefTestCaseSummaryItemProvider.dispose();
		if (tefTestRunWsProgramItemProvider != null) tefTestRunWsProgramItemProvider.dispose();
		if (tefTestRunWsProgramSummaryItemProvider != null) tefTestRunWsProgramSummaryItemProvider.dispose();
		if (tefTestStepItemProvider != null) tefTestStepItemProvider.dispose();
		if (tefTestStepSummaryItemProvider != null) tefTestStepSummaryItemProvider.dispose();
	}

}
