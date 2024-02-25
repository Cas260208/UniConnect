import flet as ft 

def main(page: ft.Page):
    # Edicion de la pagina 
    page.title = "Vorada"
    page.theme_mode = ft.ThemeMode.LIGHT

    # Botones 
    diaNac = ft.Dropdown(
        label="Dia",
        width=120, 
        options=[ft.dropdown.Option(i) for i in range(1, 32)]
    )

    mesNac = ft.Dropdown(
        label= "Mes",
        width=300, 
        options=[
            ft.dropdown.Option("Enero"),
            ft.dropdown.Option("Febrero"),
            ft.dropdown.Option("Marzo"),
            ft.dropdown.Option("Abril"),
            ft.dropdown.Option("Mayo"),
            ft.dropdown.Option("Junio"),
            ft.dropdown.Option("Julio"),
            ft.dropdown.Option("Agosto"),
            ft.dropdown.Option("Septiembre"),
            ft.dropdown.Option("Octubre"),
            ft.dropdown.Option("Noviembre"),
            ft.dropdown.Option("Diciembre"),
        ]
    )

    añoNac = ft.Dropdown(
        label="Año",
        width=120, 
        options=[ft.dropdown.Option(i) for i in range(1969, 2010)]
    )

    genero = ft.RadioGroup(
        content=ft.Row([
            ft.Radio(value="generoS", label="Femenino", adaptive=True, active_color=ft.colors.BLUE),
            ft.Radio(value="generoSe", label="Masculino", adaptive=True, active_color=ft.colors.BLUE),
            ft.Radio(value="generoSel", label="Otro", adaptive=True, active_color=ft.colors.BLUE),
        ])
    )

    # Inputs 
    nombreONombres = ft.TextField(label= "Nombre", width=285)
    apellidos = ft.TextField(label = "Apellidos", width=285)
    userName = ft.TextField(label = "User Name", width=600)
    correo = ft.TextField(label = "Correo", width=610)
    contraseña = ft.TextField(label = "Contraseña", password=True, can_reveal_password=True, width=610)

    # Contenedores
    nameSocialMedia = ft.Container (
        content=ft.Column([
            # ft.Image('image\colorVorada.png'),
            ft.Text("VORADA", color="#5271FF", size=70, weight=ft.FontWeight.W_900, selectable=True),
            ft.Text("BIENVENIDO", color="#000000", size=20, weight=ft.FontWeight.W_200, selectable=True) ,
        ]),
        bgcolor=ft.colors.WHITE,
        width=500,
        height=500,
        padding=10,
    )
    
    register = ft.Container (
        content=ft.Column([
            ft.Text("Registro", size=40),
            ft.Row([
                nombreONombres,
                apellidos,
            ]),
            userName,
            correo, 
            contraseña, 
            ft.Row([
                diaNac,
                mesNac,
                añoNac,
            ]),
            genero,
            ft.ElevatedButton("Iniciar Sesion", on_click=lambda _: page.go("/inicioDeSesion"))
        ]),
        bgcolor=ft.colors.DEEP_PURPLE_200,
        width=600,
        height=500,
        padding=10,
    )

    sigin = ft.Container (
        content=ft.Column([
            ft.Text("Inicio de sesion"),
            ft.ElevatedButton("Crear nueva cuenta", on_click=lambda _: page.go("/"))
        ]),
        bgcolor=ft.colors.DEEP_PURPLE_200,
        width=620,
        height=620,
        padding=10,
    )

    #Cambio de Pagina 
    def route_change(route):
        page.views.clear()
        page.views.append(
            ft.View(
                "/",
                [
                    ft.Row(
                        [
                            nameSocialMedia, 
                            register, 
                        ],
                    ),  
                ],
            )
        )
        if page.route == "/inicioDeSesion":
            page.views.append(
                ft.View(
                    "/inicioDeSesion",
                    [
                        ft.Row(
                            [
                                nameSocialMedia,
                                sigin,
                            ]
                        ) 
                    ],
                )
            )
        page.update()

    page.on_route_change = route_change
    page.go(page.route)

ft.app(main)