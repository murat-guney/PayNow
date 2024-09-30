// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class XASInstance implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject xASInstanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.XASInstance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		XASId("XASId"),
		LastUpdate("LastUpdate"),
		AllowedNumberOfConcurrentUsers("AllowedNumberOfConcurrentUsers"),
		PartnerName("PartnerName"),
		CustomerName("CustomerName");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public XASInstance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected XASInstance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject xASInstanceMendixObject)
	{
		if (xASInstanceMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, xASInstanceMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.xASInstanceMendixObject = xASInstanceMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static system.proxies.XASInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.XASInstance(context, mendixObject);
	}

	public static system.proxies.XASInstance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.XASInstance.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.XASInstance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> system.proxies.XASInstance.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of XASId
	 */
	public final java.lang.String getXASId()
	{
		return getXASId(getContext());
	}

	/**
	 * @param context
	 * @return value of XASId
	 */
	public final java.lang.String getXASId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.XASId.toString());
	}

	/**
	 * Set value of XASId
	 * @param xasid
	 */
	public final void setXASId(java.lang.String xasid)
	{
		setXASId(getContext(), xasid);
	}

	/**
	 * Set value of XASId
	 * @param context
	 * @param xasid
	 */
	public final void setXASId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xasid)
	{
		getMendixObject().setValue(context, MemberNames.XASId.toString(), xasid);
	}

	/**
	 * @return value of LastUpdate
	 */
	public final java.util.Date getLastUpdate()
	{
		return getLastUpdate(getContext());
	}

	/**
	 * @param context
	 * @return value of LastUpdate
	 */
	public final java.util.Date getLastUpdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastUpdate.toString());
	}

	/**
	 * Set value of LastUpdate
	 * @param lastupdate
	 */
	public final void setLastUpdate(java.util.Date lastupdate)
	{
		setLastUpdate(getContext(), lastupdate);
	}

	/**
	 * Set value of LastUpdate
	 * @param context
	 * @param lastupdate
	 */
	public final void setLastUpdate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastupdate)
	{
		getMendixObject().setValue(context, MemberNames.LastUpdate.toString(), lastupdate);
	}

	/**
	 * @return value of AllowedNumberOfConcurrentUsers
	 */
	public final java.lang.Integer getAllowedNumberOfConcurrentUsers()
	{
		return getAllowedNumberOfConcurrentUsers(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowedNumberOfConcurrentUsers
	 */
	public final java.lang.Integer getAllowedNumberOfConcurrentUsers(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.AllowedNumberOfConcurrentUsers.toString());
	}

	/**
	 * Set value of AllowedNumberOfConcurrentUsers
	 * @param allowednumberofconcurrentusers
	 */
	public final void setAllowedNumberOfConcurrentUsers(java.lang.Integer allowednumberofconcurrentusers)
	{
		setAllowedNumberOfConcurrentUsers(getContext(), allowednumberofconcurrentusers);
	}

	/**
	 * Set value of AllowedNumberOfConcurrentUsers
	 * @param context
	 * @param allowednumberofconcurrentusers
	 */
	public final void setAllowedNumberOfConcurrentUsers(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer allowednumberofconcurrentusers)
	{
		getMendixObject().setValue(context, MemberNames.AllowedNumberOfConcurrentUsers.toString(), allowednumberofconcurrentusers);
	}

	/**
	 * @return value of PartnerName
	 */
	public final java.lang.String getPartnerName()
	{
		return getPartnerName(getContext());
	}

	/**
	 * @param context
	 * @return value of PartnerName
	 */
	public final java.lang.String getPartnerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PartnerName.toString());
	}

	/**
	 * Set value of PartnerName
	 * @param partnername
	 */
	public final void setPartnerName(java.lang.String partnername)
	{
		setPartnerName(getContext(), partnername);
	}

	/**
	 * Set value of PartnerName
	 * @param context
	 * @param partnername
	 */
	public final void setPartnerName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String partnername)
	{
		getMendixObject().setValue(context, MemberNames.PartnerName.toString(), partnername);
	}

	/**
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName()
	{
		return getCustomerName(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerName.toString());
	}

	/**
	 * Set value of CustomerName
	 * @param customername
	 */
	public final void setCustomerName(java.lang.String customername)
	{
		setCustomerName(getContext(), customername);
	}

	/**
	 * Set value of CustomerName
	 * @param context
	 * @param customername
	 */
	public final void setCustomerName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customername)
	{
		getMendixObject().setValue(context, MemberNames.CustomerName.toString(), customername);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return xASInstanceMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.XASInstance that = (system.proxies.XASInstance) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
