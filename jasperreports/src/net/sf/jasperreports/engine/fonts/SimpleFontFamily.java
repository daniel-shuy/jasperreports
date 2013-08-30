/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine.fonts;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.util.JRDataUtils;



/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class SimpleFontFamily implements FontFamily
{

	/**
	 * 
	 */
	private JasperReportsContext jasperReportsContext;
	private String name;
	private SimpleFontFace normalFace;
	private SimpleFontFace boldFace;
	private SimpleFontFace italicFace;
	private SimpleFontFace boldItalicFace;
	private String pdfEncoding;
	private Boolean isPdfEmbedded;
	private String defaultExportFont;
	private Map<String,String> exportFonts;
	private Set<String> locales;
	
	/**
	 * @see #SimpleFontFamily(JasperReportsContext)
	 */
	public SimpleFontFamily()
	{
		this(DefaultJasperReportsContext.getInstance());
	}
	
	/**
	 * 
	 */
	public SimpleFontFamily(JasperReportsContext jasperReportsContext)
	{
		this.jasperReportsContext = jasperReportsContext;
	}
	
	/**
	 * 
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * @deprecated Replaced by {@link #setNormalFace(SimpleFontFace)}.
	 */
	public void setNormal(String normal)
	{
		if (normalFace == null)
		{
			normalFace = new SimpleFontFace(jasperReportsContext);
		}
		normalFace.setTtf(normal);
	}
	
	/**
	 * @deprecated Replaced by {@link #setBoldFace(SimpleFontFace)}.
	 */
	public void setBold(String bold)
	{
		if (boldFace == null)
		{
			boldFace = new SimpleFontFace(jasperReportsContext);
		}
		boldFace.setTtf(bold);
	}
	
	/**
	 * @deprecated Replaced by {@link #setItalicFace(SimpleFontFace)}.
	 */
	public void setItalic(String italic)
	{
		if (italicFace == null)
		{
			italicFace = new SimpleFontFace(jasperReportsContext);
		}
		italicFace.setTtf(italic);
	}
	
	/**
	 * @deprecated Replaced by {@link #setBoldItalicFace(SimpleFontFace)}.
	 */
	public void setBoldItalic(String boldItalic)
	{
		if (boldItalicFace == null)
		{
			boldItalicFace = new SimpleFontFace(jasperReportsContext);
		}
		boldItalicFace.setTtf(boldItalic);
	}

	/**
	 * 
	 */
	public FontFace getNormalFace()
	{
		return normalFace;
	}

	/**
	 * 
	 */
	public void setNormalFace(SimpleFontFace normalFace)
	{
		this.normalFace = normalFace;
	}
	
	/**
	 * 
	 */
	public FontFace getBoldFace()
	{
		return boldFace;
	}

	/**
	 * 
	 */
	public void setBoldFace(SimpleFontFace boldFace)
	{
		this.boldFace = boldFace;
	}
	
	/**
	 * 
	 */
	public FontFace getItalicFace()
	{
		return italicFace;
	}

	/**
	 * 
	 */
	public void setItalicFace(SimpleFontFace italicFace)
	{
		this.italicFace = italicFace;
	}
	
	/**
	 * 
	 */
	public FontFace getBoldItalicFace()
	{
		return boldItalicFace;
	}

	/**
	 * 
	 */
	public void setBoldItalicFace(SimpleFontFace boldItalicFace)
	{
		this.boldItalicFace = boldItalicFace;
	}
	
	/**
	 * @deprecated Replaced by {@link FontFace#getPdf()}.
	 */
	public String getNormalPdfFont()
	{
		return getNormalFace() == null ? null : getNormalFace().getPdf();
	}
	
	/**
	 * @deprecated Replaced by {@link SimpleFontFace#setPdf(String)}.
	 */
	public void setNormalPdfFont(String normalPdfFont)
	{
		if (normalFace == null)
		{
			normalFace = new SimpleFontFace(jasperReportsContext);
		}
		normalFace.setPdf(normalPdfFont);
	}
	
	/**
	 * @deprecated Replaced by {@link FontFace#getPdf()}.
	 */
	public String getBoldPdfFont()
	{
		return getBoldFace() == null ? null : getBoldFace().getPdf();
	}
	
	/**
	 * @deprecated Replaced by {@link SimpleFontFace#setPdf(String)}.
	 */
	public void setBoldPdfFont(String boldPdfFont)
	{
		if (boldFace == null)
		{
			boldFace = new SimpleFontFace(jasperReportsContext);
		}
		boldFace.setPdf(boldPdfFont);
	}
	
	/**
	 * @deprecated Replaced by {@link FontFace#getPdf()}.
	 */
	public String getItalicPdfFont()
	{
		return getItalicFace() == null ? null : getItalicFace().getPdf();
	}
	
	/**
	 * @deprecated Replaced by {@link SimpleFontFace#setPdf(String)}.
	 */
	public void setItalicPdfFont(String italicPdfFont)
	{
		if (italicFace == null)
		{
			italicFace = new SimpleFontFace(jasperReportsContext);
		}
		italicFace.setPdf(italicPdfFont);
	}
	
	/**
	 * @deprecated Replaced by {@link FontFace#getPdf()}.
	 */
	public String getBoldItalicPdfFont()
	{
		return getBoldItalicFace() == null ? null : getBoldItalicFace().getPdf();
	}
	
	/**
	 * @deprecated Replaced by {@link SimpleFontFace#setPdf(String)}.
	 */
	public void setBoldItalicPdfFont(String boldItalicPdfFont)
	{
		if (boldItalicFace == null)
		{
			boldItalicFace = new SimpleFontFace(jasperReportsContext);
		}
		boldItalicFace.setPdf(boldItalicPdfFont);
	}
	
	/**
	 * 
	 */
	public String getPdfEncoding()
	{
		return pdfEncoding;
	}
	
	/**
	 * 
	 */
	public void setPdfEncoding(String pdfEncoding)
	{
		this.pdfEncoding = pdfEncoding;
	}
	
	/**
	 * 
	 */
	public Boolean isPdfEmbedded()
	{
		return isPdfEmbedded;
	}
	
	/**
	 * 
	 */
	public void setPdfEmbedded(Boolean isPdfEmbedded)
	{
		this.isPdfEmbedded = isPdfEmbedded;
	}
	
	/**
	 * 
	 */
	public String getDefaultExportFont()
	{
		return defaultExportFont;
	}
	
	/**
	 * 
	 */
	public void setDefaultExportFont(String defaultExportFont)
	{
		this.defaultExportFont = defaultExportFont;
	}
	
	/**
	 * 
	 */
	public Map<String,String> getExportFonts()
	{
		return exportFonts;
	}
	
	/**
	 * 
	 */
	public void setExportFonts(Map<String,String> exportFonts)
	{
		this.exportFonts = exportFonts;
	}
	
	/**
	 * 
	 */
	public String getExportFont(String key)
	{
		String exportFont = exportFonts == null ? null : (String)exportFonts.get(key);
		return exportFont == null ? defaultExportFont : exportFont;
	}
	
	/**
	 * 
	 */
	public Set<String> getLocales()
	{
		return locales;
	}
	
	/**
	 * 
	 */
	public void setLocales(Set<String> locales)
	{
		this.locales = locales;
	}
	
	/**
	 * 
	 */
	public boolean supportsLocale(Locale locale)
	{
		return locales == null || locales.isEmpty() || locales.contains(JRDataUtils.getLocaleCode(locale));
	}
	
}