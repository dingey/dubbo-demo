<#import "base/admin_layout.ftl" as layout /> <#import "base/spring.ftl"
as spring/> <@layout.standard title="首页"
cssMap={"":""}
jsMap={"":""}>
<div class="container">
	<div class="row">
		<div class="col-sm-12">
			<p>name:${name!}</p>
		</div>
	</div>
</div>
</@layout.standard>