package practicaswss.rest.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter(urlPatterns= {"/v1.0/clientes/*"}) //Para interceptar URL  todos los que llevan esto en su url
public class FiltroREST implements Filter{
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	//Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest peticion = (HttpServletRequest) request;

		String remoteAddr = peticion.getRemoteAddr();
		
		System.out.println("Servicio REST invocado desde " + remoteAddr);
		
		//Invocamos al componente destinatario de la petición
		chain.doFilter(request, response);
		
	}
	
	
	
	
	

}
