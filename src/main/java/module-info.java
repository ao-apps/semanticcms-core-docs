/*
 * semanticcms-core-docs - Documentation runner for Java API for modeling web page content and relationships.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-core-docs.
 *
 * semanticcms-core-docs is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-core-docs is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-core-docs.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.core.docs {
  requires com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  requires com.semanticcms.core.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all-book</artifactId>
  requires com.semanticcms.core.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-bom-book</artifactId>
  requires com.semanticcms.core.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-book</artifactId>
  requires com.semanticcms.core.breadcrumblist.jsonld.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-breadcrumblist-json-ld-book</artifactId>
  requires com.semanticcms.core.canonical.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-canonical-book</artifactId>
  requires com.semanticcms.core.model.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model-book</artifactId>
  requires com.semanticcms.core.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-servlet-book</artifactId>
  requires com.semanticcms.core.sitemap.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-sitemap-book</artifactId>
  requires com.semanticcms.core.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-style-book</artifactId>
  requires com.semanticcms.core.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib-book</artifactId>
  requires com.semanticcms.core.theme.base.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-theme-base-book</artifactId>
  requires com.semanticcms.core.view.content.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-view-content-book</artifactId>
  requires com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  requires com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
}
