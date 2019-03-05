package com.liferay.commerce.batch.item.internal.model;

import com.liferay.commerce.openapi.core.annotation.Nullable;

import java.util.Map;

public class ProductDTO {

	@Nullable
	public Integer[] getAssetCategoryIds() {
		return _assetCategoryIds;
	}

	@Nullable
	public String getDefaultSku() {
		return _defaultSku;
	}

	@Nullable
	public Map<String, String> getDescription() {
		return _description;
	}

	@Nullable
	public Map<String, ?> getExpando() {
		return _expando;
	}

	public String getExternalReferenceCode() {
		return _externalReferenceCode;
	}

	@Nullable
	public Long getId() {
		return _id;
	}

	public Map<String, String> getName() {
		return _name;
	}

	public String getProductTypeName() {
		return _productTypeName;
	}

	@Nullable
	public Map<String, String> getShortDescription() {
		return _shortDescription;
	}

	@Nullable
	public SkuDTO[] getSkus() {
		return _skus;
	}

	public Boolean isActive() {
		return _active;
	}

	public void setActive(Boolean active) {
		_active = active;
	}

	public void setAssetCategoryIds(Integer[] assetCategoryIds) {
		_assetCategoryIds = assetCategoryIds;
	}

	public void setDefaultSku(String defaultSku) {
		_defaultSku = defaultSku;
	}

	public void setDescription(Map<String, String> description) {
		_description = description;
	}

	public void setExpando(Map<String, ?> expando) {
		_expando = expando;
	}

	public void setExternalReferenceCode(String externalReferenceCode) {
		_externalReferenceCode = externalReferenceCode;
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setName(Map<String, String> name) {
		_name = name;
	}

	public void setProductTypeName(String productTypeName) {
		_productTypeName = productTypeName;
	}

	public void setShortDescription(Map<String, String> shortDescription) {
		_shortDescription = shortDescription;
	}

	public void setSkus(SkuDTO[] skus) {
		_skus = skus;
	}

	private Boolean _active;

	@Nullable
	private Integer[] _assetCategoryIds;

	@Nullable
	private String _defaultSku;

	@Nullable
	private Map<String, String> _description;

	@Nullable
	private Map<String, ?> _expando;

	private String _externalReferenceCode;

	@Nullable
	private Long _id;

	private Map<String, String> _name;
	private String _productTypeName;

	@Nullable
	private Map<String, String> _shortDescription;

	@Nullable
	private SkuDTO[] _skus;

}