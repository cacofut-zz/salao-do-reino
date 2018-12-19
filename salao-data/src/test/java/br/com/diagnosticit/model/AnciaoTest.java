/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import br.com.diagnosticit.exceptions.DataInicialMaiorQueDataFinalException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author cristianoca
 */
public class AnciaoTest {
    
    @Before
    public void setup(){
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deve_lancar_exception_data_inicial_null(){        
        //cenário 
        Anciao anciao = new Anciao(null, "Ancião", null, new Date(), true, null);                
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deve_lancar_exception_data_final_null(){        
        //cenário 
        Anciao anciao = new Anciao(null, "Ancião", new Date(), null, true, null);
                
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deve_lancar_exception_publicador_batizado_null(){        
        //cenário 
        PublicadorBatizado batizado = new PublicadorBatizado();
        Anciao anciao = new Anciao(null, "Ancião", new Date(), new Date(), true, null);
                
    }
    
    @Test
    public void nao_deve_ter_data_inicial_maior_que_data_final() throws ParseException{
        //cenário
        PublicadorBatizado batizado = new PublicadorBatizado();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataInicial = sdf.parse("20/02/2018 19:30:20");
        Date dataFinal   = sdf.parse("21/02/2018 19:30:20");
                
        Anciao anciao = new Anciao(null, "Ancião", dataInicial, dataFinal, true, batizado);

        assertTrue(dataInicial.getTime() < dataFinal.getTime());
        
    }
    
    @Test
    public void deve_ter_data_inicial_menor_que_data_final() throws ParseException{
        //cenário
        PublicadorBatizado batizado = new PublicadorBatizado();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataInicial = sdf.parse("20/02/2018 19:29:20");
        Date dataFinal   = sdf.parse("20/02/2018 19:30:20");
        
        //ação
        Anciao anciao = new Anciao(null, "Ancião", dataInicial, dataFinal, true, batizado);
        
        assertTrue(dataInicial.getTime() < dataFinal.getTime());
    }
    
    @Test(expected = DataInicialMaiorQueDataFinalException.class)
    public void deve_lancar_exception_datainicial_maior_que_datafinal() throws ParseException{
        
        //cenário
        PublicadorBatizado batizado = new PublicadorBatizado();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataInicial = sdf.parse("23/02/2018 19:30:20");
        Date dataFinal   = sdf.parse("21/02/2018 19:30:20");
                
        Anciao anciao = new Anciao(null, "Ancião", dataInicial, dataFinal, true, batizado);
    }
    
}
