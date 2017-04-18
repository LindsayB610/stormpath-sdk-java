package com.stormpath.sdk.impl.okta;

import com.stormpath.sdk.impl.ds.InternalDataStore;
import com.stormpath.sdk.impl.resource.AbstractInstanceResource;
import com.stormpath.sdk.impl.resource.Property;
import com.stormpath.sdk.impl.resource.StringProperty;
import com.stormpath.sdk.okta.OktaOIDCWellKnownResource;

import java.util.Map;

/**
 */
public class DefaultOktaOIDCWellKnownResource extends AbstractInstanceResource implements OktaOIDCWellKnownResource {


    private static final StringProperty AUTHORIZATION_ENDPOINT = new StringProperty("authorization_endpoint");
    private static final StringProperty INTROSPECTION_ENDPOINT = new StringProperty("introspection_endpoint");
    private static final StringProperty JWKS_URI = new StringProperty("jwks_uri");
    private static final StringProperty REVOCATION_ENDPOINT = new StringProperty("revocation_endpoint");
    private static final StringProperty TOKEN_ENDPOINT = new StringProperty("token_endpoint");

    private static final Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(AUTHORIZATION_ENDPOINT, INTROSPECTION_ENDPOINT, JWKS_URI, REVOCATION_ENDPOINT, TOKEN_ENDPOINT);

    public DefaultOktaOIDCWellKnownResource(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultOktaOIDCWellKnownResource(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }

    @Override
    public String getAuthorizationEndpoint() {
        return getString(AUTHORIZATION_ENDPOINT);
    }

    @Override
    public OktaOIDCWellKnownResource setAuthorizationEndpoint(String authorizationEndpoint) {
        setProperty(AUTHORIZATION_ENDPOINT, authorizationEndpoint);
        return this;
    }

    @Override
    public String getIntrospectionEndpoint() {
        return getString(INTROSPECTION_ENDPOINT);
    }

    @Override
    public OktaOIDCWellKnownResource setIntrospectionEndpoint(String introspectionEndpoint) {
        setProperty(INTROSPECTION_ENDPOINT, introspectionEndpoint);
        return this;
    }

    @Override
    public String getJwksUri() {
        return getString(JWKS_URI);
    }

    @Override
    public OktaOIDCWellKnownResource setJwksUri(String jwksUri) {
        setProperty(JWKS_URI, jwksUri);
        return this;
    }

    @Override
    public String getRevocationEndpoint() {
        return getString(REVOCATION_ENDPOINT);
    }

    @Override
    public OktaOIDCWellKnownResource setRevocationEndpoint(String revocationEndpoint) {
        setProperty(REVOCATION_ENDPOINT, revocationEndpoint);
        return this;
    }

    @Override
    public String getTokenEndpoint() {
        return getString(TOKEN_ENDPOINT);
    }

    @Override
    public OktaOIDCWellKnownResource setTokenEndpoint(String tokenEndpoint) {
        setProperty(TOKEN_ENDPOINT, tokenEndpoint);
        return this;
    }
}
