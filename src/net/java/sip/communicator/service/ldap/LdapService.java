/*
 * SIP Communicator, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package net.java.sip.communicator.service.ldap;

/**
 * The Ldap Service allows other modules to query an LDAP server
 *
 * @author Sebastien Mazy
 */
public interface LdapService
    extends LdapConstants
{
    /**
     * Returns all the LDAP directories
     *
     * @return the LdapDirectorySet containing all the LdapDirectory(s)
     * registered
     */
    public LdapDirectorySet getServerSet();

    /**
     * Returns the LdapFactory, used to
     * create LdapDirectoryS, LdapDirectorySettings, LdapQuery, ...
     *
     * @return the LdapFactory, used to
     */
    public LdapFactory getFactory();
}
